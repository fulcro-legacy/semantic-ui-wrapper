(ns fulcrologic.semantic-ui.factories
  (:require
    cljsjs.semantic-ui-react
    goog.object
    [fulcro.client.dom :as dom]))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement
      class
      (clj->js props)
      children)))

(defn wrapped-factory-apply
  "Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop."
  [class]
  (let [factory (dom/wrap-form-element class)]
    (fn [props & children] (apply factory (clj->js props) children))))

(def semantic-ui js/semanticUIReact)

(defn get-sui
  ([cls]
   (goog.object/get semantic-ui cls)))

(defn sui-factory
  [cls] (factory-apply (get-sui cls)))

(defn sui-input-factory
  [cls]
  (wrapped-factory-apply (get-sui cls)))

(def ui-reveal
  "A reveal displays additional content in place of previous content when activated.

  Props:
    - active (bool): An active reveal displays its hidden content.
    - animated (enum): An animation name that will be applied to Reveal. (fade, small fade, move, move right, move up, move down, rotate, rotate left)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A disabled reveal will not animate when hovered.
    - instant (bool): An element can show its content without delay."
  (sui-factory "Reveal"))

(def ui-list-description
  "A list item can contain a description.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ListDescription"))

(def ui-feed
  "A feed presents user activity chronologically.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - events (custom): Shorthand array of props for FeedEvent.
    - size (enum): A feed can have different sizes. (small, large)"
  (sui-factory "Feed"))

(def ui-transition
  "A transition is an animation usually used to move content in or out of view.

  Props:
    - animation (enum): Named animation event to used. Must be defined in CSS. (browse, browse right, drop, fade, fade up, fade down, fade left, fade right, fly up, fly down, fly left, fly right, horizontal flip, vertical flip, scale, slide up, slide down, slide left, slide right, swing up, swing down, swing left, swing right, zoom, jiggle, flash, shake, pulse, tada, bounce, glow)
    - children (element): Primary content.
    - duration (number|shape|string): Duration of the CSS transition animation in milliseconds. ()
    - mountOnShow (bool): Wait until the first \"enter\" transition to mount the component (add it to the DOM).
    - onComplete (func): Callback on each transition that changes visibility to shown.
    - onHide (func): Callback on each transition that changes visibility to hidden.
    - onShow (func): Callback on each transition that changes visibility to shown.
    - onStart (func): Callback on animation start.
    - reactKey (string): React's key of the element.
    - transitionOnMount (bool): Run the enter animation when the component mounts, if it is initially shown.
    - unmountOnHide (bool): Unmount the component (remove it from the DOM) when it is not shown.
    - visible (bool): Show the component; triggers the enter or exit animation."
  (sui-factory "Transition"))

(def ui-popup-content
  "A PopupContent displays the content body of a Popover.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): The content of the Popup
    - className (string): Classes to add to the Popup content className.
    - content (custom): Shorthand for primary content."
  (sui-factory "PopupContent"))

(def ui-search-results
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "SearchResults"))

(def ui-button-or
  "Button groups can contain conditionals.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - text (number|string): Or buttons can have their text localized, or adjusted by using the text prop. ()"
  (sui-factory "ButtonOr"))

(def ui-accordion-panel
  "A panel sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - content (custom): A shorthand for Accordion.Content.
    - index (number|string): A panel index. ()
    - onTitleClick (func): Called when a panel title is clicked.
    - title (custom): A shorthand for Accordion.Title."
  (sui-factory "AccordionPanel"))

(def ui-menu-menu
  "A menu can contain a sub menu.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - position (enum): A sub menu can take left or right position. (left, right)"
  (sui-factory "MenuMenu"))

(def ui-placeholder-image
  "A placeholder can contain an image.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - rectangular (bool): An image can modify size correctly with responsive styles. ()
    - square (bool): An image can modify size correctly with responsive styles. ()"
  (sui-factory "PlaceholderImage"))

(def ui-image
  "An image is a graphic representation of something.

  Props:
    - as (custom): An element type to render as (string or function).
    - avatar (bool): An image may be formatted to appear inline with text as an avatar.
    - bordered (bool): An image may include a border to emphasize the edges of white or transparent content.
    - centered (bool): An image can appear centered in a content block.
    - children (node): Primary content.
    - circular (bool): An image may appear circular.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmer (custom): Shorthand for Dimmer.
    - disabled (bool): An image can show that it is disabled and cannot be selected.
    - floated (enum): An image can sit to the left or right of other content. (left, right)
    - fluid (bool): An image can take up the width of its container. ()
    - hidden (bool): An image can be hidden.
    - href (string): Renders the Image as an <a> tag with this href.
    - inline (bool): An image may appear inline.
    - label (custom): Shorthand for Label.
    - rounded (bool): An image may appear rounded.
    - size (enum): An image may appear at different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - spaced (bool|enum): An image can specify that it needs an additional spacing to separate it from nearby content. (left, right)
    - ui (bool): Whether or not to add the ui className.
    - verticalAlign (enum): An image can specify its vertical alignment. (bottom, middle, top)
    - wrapped (bool): An image can render wrapped in a `div.ui.image` as alternative HTML markup."
  (sui-factory "Image"))

(def ui-sticky
  "Sticky content stays fixed to the browser viewport while another column of content is visible on the page.

  Props:
    - active (bool): A Sticky can be active.
    - as (custom): An element type to render as (string or function).
    - bottomOffset (number): Offset in pixels from the bottom of the screen when fixing element to viewport.
    - children (node): Primary content.
    - className (string): Additional classes.
    - context (object): Context which sticky element should stick to.
    - offset (number): Offset in pixels from the top of the screen when fixing element to viewport.
    - onBottom (func): Callback when element is bound to bottom of parent container.
    - onStick (func): Callback when element is fixed to page.
    - onTop (func): Callback when element is bound to top of parent container.
    - onUnstick (func): Callback when element is unfixed from page.
    - pushing (bool): Whether element should be \"pushed\" by the viewport, attaching to the bottom of the screen when scrolling up.
    - scrollContext (object): Context which sticky should attach onscroll events.
    - styleElement (object): Custom style for sticky element."
  (sui-factory "Sticky"))

(def ui-comment-text
  "A comment can contain text.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentText"))

(def ui-grid-row
  "A row sub-component for Grid.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A row can have its columns centered.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A grid row can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - columns (enum): Represents column count per line in Row. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)
    - divided (bool): A row can have dividers between its columns.
    - only (custom): A row can appear only for a specific device, or screen sizes.
    - reversed (custom): A row can specify that its columns should reverse order at different device sizes.
    - stretched (bool): A row can stretch its contents to take up the entire column height.
    - textAlign (enum): A row can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A row can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)"
  (sui-factory "GridRow"))

(def ui-message-header
  "A message can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "MessageHeader"))

(def ui-modal-header
  "A modal can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ModalHeader"))

(def ui-search-category
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - name (string): Display name.
    - renderer (func): Renders the category contents.
    - results (array): Array of Search.Result props."
  (sui-factory "SearchCategory"))

(def ui-list-header
  "A list item can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ListHeader"))

(def ui-feed-date
  "An event or an event summary can contain a date.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "FeedDate"))

(def ui-item-header
  "An item can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ItemHeader"))

(def ui-popup
  "A Popup displays additional information on top of a page.

  Props:
    - as (custom): An element type to render as (string or function).
    - basic (bool): Display the popup without the pointing arrow.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Simple text content for the popover.
    - context (object): Existing element the pop-up should be bound to.
    - flowing (bool): A flowing Popup has no maximum width and continues to flow to fit its content.
    - header (custom): Header displayed above the content in bold.
    - hideOnScroll (bool): Hide the Popup when scrolling the window.
    - horizontalOffset (number): Horizontal offset in pixels to be applied to the Popup.
    - hoverable (bool): Whether the popup should not close on hover.
    - inverted (bool): Invert the colors of the Popup.
    - keepInViewPort (bool): Element to be rendered within the confines of the viewport whenever possible.
    - on (enum|arrayOf): Events triggering the popup. (hover, click, focus)
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - position (enum): Position for the popover. (top left, top right, bottom right, bottom left, right center, left center, top center, bottom center)
    - size (enum): Popup size. (mini, tiny, small, large, huge)
    - style (object): Custom Popup style.
    - trigger (node): Element to be rendered in-place where the popup is defined.
    - verticalOffset (number): Vertical offset in pixels to be applied to the Popup.
    - wide (bool|enum): Popup width. (very)"
  (sui-factory "Popup"))

(def ui-message
  "A message displays information that explains nearby content.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A message can be formatted to attach itself to other content. (bottom, top)
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A message can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A message can only take up the width of its content.
    - content (custom): Shorthand for primary content.
    - error (bool): A message may be formatted to display a negative message. Same as `negative`.
    - floating (bool): A message can float above content that it is related to.
    - header (custom): Shorthand for MessageHeader.
    - hidden (bool): A message can be hidden.
    - icon (custom|bool): A message can contain an icon. ()
    - info (bool): A message may be formatted to display information.
    - list (custom): Array shorthand items for the MessageList. Mutually exclusive with children.
    - negative (bool): A message may be formatted to display a negative message. Same as `error`.
    - onDismiss (func): A message that the user can choose to hide.
    - positive (bool): A message may be formatted to display a positive message.  Same as `success`.
    - size (enum): A message can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - success (bool): A message may be formatted to display a positive message.  Same as `positive`.
    - visible (bool): A message can be set to visible to force itself to be shown.
    - warning (bool): A message may be formatted to display warning messages."
  (sui-factory "Message"))

(def ui-button-group
  "Buttons can be grouped.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Groups can be attached to other content. (left, right, top, bottom)
    - basic (bool): Groups can be less pronounced.
    - buttons (custom): Array of shorthand Button values.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Groups can have a shared color. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): Groups can reduce their padding to fit into tighter spaces.
    - content (custom): Shorthand for primary content.
    - floated (enum): Groups can be aligned to the left or right of its container. (left, right)
    - fluid (bool): Groups can take the width of their container.
    - icon (bool): Groups can be formatted as icons.
    - inverted (bool): Groups can be formatted to appear on dark backgrounds.
    - labeled (bool): Groups can be formatted as labeled icon buttons.
    - negative (bool): Groups can hint towards a negative consequence.
    - positive (bool): Groups can hint towards a positive consequence.
    - primary (bool): Groups can be formatted to show different levels of emphasis.
    - secondary (bool): Groups can be formatted to show different levels of emphasis.
    - size (enum): Groups can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - toggle (bool): Groups can be formatted to toggle on and off.
    - vertical (bool): Groups can be formatted to appear vertically.
    - widths (enum): Groups can have their widths divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "ButtonGroup"))

(def ui-label
  "A label displays content classification.

  Props:
    - active (bool): A label can be active.
    - as (custom): An element type to render as (string or function).
    - attached (enum): A label can attach to a content segment. (top, bottom, top right, top left, bottom left, bottom right)
    - basic (bool): A label can reduce its complexity.
    - children (node): Primary content.
    - circular (bool): A label can be circular.
    - className (string): Additional classes.
    - color (enum): Color of the label. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - corner (bool|enum): A label can position itself in the corner of an element. (left, right)
    - detail (custom): Shorthand for LabelDetail.
    - empty (bool): Formats the label as a dot. ()
    - floating (bool): Float above another element in the upper right corner.
    - horizontal (bool): A horizontal label is formatted to label content along-side it horizontally.
    - icon (custom): Shorthand for Icon.
    - image (bool|custom): A label can be formatted to emphasize an image or prop can be used as shorthand for Image. ()
    - onClick (func): Called on click.
    - onRemove (func): Adds an \"x\" icon, called when \"x\" is clicked.
    - pointing (bool|enum): A label can point to content next to it. (above, below, left, right)
    - removeIcon (custom): Shorthand for Icon to appear as the last child and trigger onRemove.
    - ribbon (bool|enum): A label can appear as a ribbon attaching itself to an element. (right)
    - size (enum): A label can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - tag (bool): A label can appear as a tag."
  (sui-factory "Label"))

(def ui-accordion
  "An accordion allows users to toggle the display of sections of content.

  Props:
    - className (string): Additional classes.
    - fluid (bool): Format to take up the width of its container.
    - inverted (bool): Format for dark backgrounds.
    - styled (bool): Adds some basic styling to accordion panels."
  (sui-factory "Accordion"))

(def ui-portal-inner
  "An inner component that allows you to render children outside their parent.

  Props:
    - children (node): Primary content.
    - mountNode (any): The node where the portal should mount.
    - onMount (func): Called when the portal is mounted on the DOM
    - onUnmount (func): Called when the portal is unmounted from the DOM"
  (sui-factory "PortalInner"))

(def ui-input
  "An Input is a field used to elicit a response from a user.

  Props:
    - action (bool|custom): An Input can be formatted to alert the user to an action they may perform. ()
    - actionPosition (enum): An action can appear along side an Input on the left or right. (left)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - disabled (bool): An Input field can show that it is disabled.
    - error (bool): An Input field can show the data contains errors.
    - fluid (bool): Take on the size of its container.
    - focus (bool): An Input field can show a user is currently interacting with it.
    - icon (bool|custom): Optional Icon to display inside the Input. ()
    - iconPosition (enum): An Icon can appear inside an Input on the left or right. (left)
    - input (custom): Shorthand for creating the HTML Input.
    - inverted (bool): Format to appear on dark backgrounds.
    - label (custom): Optional Label to display along side the Input.
    - labelPosition (enum): A Label can appear outside an Input on the left or right. (left, right, left corner, right corner)
    - loading (bool): An Icon Input field can show that it is currently loading data.
    - onChange (func): Called on change.
    - size (enum): An Input can vary in size. (mini, tiny, small, medium, large, big, huge, massive)
    - tabIndex (number|string): An Input can receive focus. ()
    - transparent (bool): Transparent Input has no background.
    - type (string): The HTML input type."
  (sui-input-factory "Input"))

(def ui-responsive
  "Responsive can control visibility of content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - fireOnMount (bool): Fires callbacks immediately after mount.
    - getWidth (func): Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    - maxWidth (number|string): The maximum width at which content will be displayed. ()
    - minWidth (number|string): The minimum width at which content will be displayed. ()
    - onUpdate (func): Called on update."
  (sui-factory "Responsive"))

(def ui-icon-group
  "Several icons can be used together as a group.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): Size of the icon group. (mini, tiny, small, large, big, huge, massive)"
  (sui-factory "IconGroup"))

(def ui-placeholder-line
  "A placeholder can contain have lines of text.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - length (enum): A line can specify how long its contents should appear. (full, very long, long, medium, short, very short)"
  (sui-factory "PlaceholderLine"))

(def ui-portal
  "A component that allows you to render children outside their parent.

  Props:
    - children (node): Primary content.
    - closeOnDocumentClick (bool): Controls whether or not the portal should close when the document is clicked.
    - closeOnEscape (bool): Controls whether or not the portal should close when escape is pressed is displayed.
    - closeOnPortalMouseLeave (bool): Controls whether or not the portal should close when mousing out of the portal.
    - closeOnTriggerBlur (bool): Controls whether or not the portal should close on blur of the trigger.
    - closeOnTriggerClick (bool): Controls whether or not the portal should close on click of the trigger.
    - closeOnTriggerMouseLeave (bool): Controls whether or not the portal should close when mousing out of the trigger.
    - defaultOpen (bool): Initial value of open.
    - eventPool (string): Event pool namespace that is used to handle component events
    - mountNode (any): The node where the portal should mount.
    - mouseEnterDelay (number): Milliseconds to wait before opening on mouse over
    - mouseLeaveDelay (number): Milliseconds to wait before closing on mouse leave
    - onClose (func): Called when a close event happens
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - open (bool): Controls whether or not the portal is displayed.
    - openOnTriggerClick (bool): Controls whether or not the portal should open when the trigger is clicked.
    - openOnTriggerFocus (bool): Controls whether or not the portal should open on focus of the trigger.
    - openOnTriggerMouseEnter (bool): Controls whether or not the portal should open when mousing over the trigger.
    - trigger (node): Element to be rendered in-place where the portal is defined.
    - triggerRef (func): Called with a ref to the trigger node."
  (sui-factory "Portal"))

(def ui-comment-content
  "A comment can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentContent"))

(def ui-transition-group
  "A Transition.Group animates children as they mount and unmount.

  Props:
    - animation (enum): Named animation event to used. Must be defined in CSS. (browse, browse right, drop, fade, fade up, fade down, fade left, fade right, fly up, fly down, fly left, fly right, horizontal flip, vertical flip, scale, slide up, slide down, slide left, slide right, swing up, swing down, swing left, swing right, zoom, jiggle, flash, shake, pulse, tada, bounce, glow)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - duration (number|shape|string): Duration of the CSS transition animation in milliseconds. ()"
  (sui-factory "TransitionGroup"))

(def ui-button
  "A Button indicates a possible user action.

  Props:
    - active (bool): A button can show it is currently the active user selection.
    - animated (bool|enum): A button can animate to show hidden content. (fade, vertical)
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A button can be attached to other content. (left, right, top, bottom)
    - basic (bool): A basic button is less pronounced.
    - children (node): Primary content. ()
    - circular (bool): A button can be circular.
    - className (string): Additional classes.
    - color (enum): A button can have different colors (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black, facebook, google plus, instagram, linkedin, twitter, vk, youtube)
    - compact (bool): A button can reduce its padding to fit into tighter spaces.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A button can show it is currently unable to be interacted with.
    - floated (enum): A button can be aligned to the left or right of its container. (left, right)
    - fluid (bool): A button can take the width of its container.
    - icon (custom): Add an Icon by name, props object, or pass an <Icon />.
    - inverted (bool): A button can be formatted to appear on dark backgrounds.
    - label (custom): Add a Label by text, props object, or pass a <Label />.
    - labelPosition (enum): A labeled button can format a Label or Icon to appear on the left or right. (right, left)
    - loading (bool): A button can show a loading indicator.
    - negative (bool): A button can hint towards a negative consequence.
    - onClick (func): Called after user's click.
    - positive (bool): A button can hint towards a positive consequence.
    - primary (bool): A button can be formatted to show different levels of emphasis.
    - role (string): The role of the HTML element.
    - secondary (bool): A button can be formatted to show different levels of emphasis.
    - size (enum): A button can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)
    - tabIndex (number|string): A button can receive focus. ()
    - toggle (bool): A button can be formatted to toggle on and off."
  (sui-factory "Button"))

(def ui-segment-group
  "A group of segments can be formatted to appear together.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - compact (bool): A segment may take up only as much space as is necessary.
    - content (custom): Shorthand for primary content.
    - horizontal (bool): Formats content to be aligned horizontally.
    - piled (bool): Formatted to look like a pile of pages.
    - raised (bool): A segment group may be formatted to raise above the page.
    - size (enum): A segment group can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stacked (bool): Formatted to show it contains multiple pages."
  (sui-factory "SegmentGroup"))

(def ui-list-item
  "A list item can contain a set of items.

  Props:
    - active (bool): A list item can active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - disabled (bool): A list item can disabled.
    - header (custom): Shorthand for ListHeader.
    - icon (custom): Shorthand for ListIcon. ()
    - image (custom): Shorthand for Image. ()
    - onClick (func): A ListItem can be clicked
    - value (string): A value for an ordered list."
  (sui-factory "ListItem"))

(def ui-comment
  "A comment displays user feedback to site content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comment can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content."
  (sui-factory "Comment"))

(def ui-list-icon
  "A list item can contain an icon.

  Props:
    - className (string): Additional classes.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
  (sui-factory "ListIcon"))

(def ui-container
  "A container limits content to a maximum width.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): Container has no maximum width.
    - text (bool): Reduce maximum width to more naturally accommodate text.
    - textAlign (enum): Align container text. (left, center, right, justified)"
  (sui-factory "Container"))

(def ui-menu
  "A menu displays grouped navigation actions.

  Props:
    - activeIndex (number|string): Index of the currently active item. ()
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): A menu may be attached to other content segments. (top, bottom)
    - borderless (bool): A menu item or menu can have no borders.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Additional colors can be specified. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A menu can take up only the space necessary to fit its content.
    - defaultActiveIndex (number|string): Initial activeIndex value. ()
    - fixed (enum): A menu can be fixed to a side of its context. (left, right, bottom, top)
    - floated (bool|enum): A menu can be floated. (right)
    - fluid (bool): A vertical menu may take the size of its container.
    - icon (bool|enum): A menu may have just icons (bool) or labeled icons. (labeled)
    - inverted (bool): A menu may have its colors inverted to show greater contrast.
    - items (custom): Shorthand array of props for Menu.
    - onItemClick (func): onClick handler for MenuItem. Mutually exclusive with children. ()
    - pagination (bool): A pagination menu is specially formatted to present links to pages of content.
    - pointing (bool): A menu can point to show its relationship to nearby content.
    - secondary (bool): A menu can adjust its appearance to de-emphasize its contents.
    - size (enum): A menu can vary in size. (mini, tiny, small, large, huge, massive)
    - stackable (bool): A menu can stack at mobile resolutions.
    - tabular (bool|enum): A menu can be formatted to show tabs of information. (right)
    - text (bool): A menu can be formatted for text content.
    - vertical (bool): A vertical menu displays elements vertically.
    - widths (enum): A menu can have its items divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "Menu"))

(def ui-form-group
  "A set of fields can appear grouped together.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - grouped (bool): Fields can show related choices. ()
    - inline (bool): Multiple fields may be inline in a row. ()
    - unstackable (bool): A form group can prevent itself from stacking on mobile.
    - widths (enum): Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)"
  (sui-factory "FormGroup"))

(def ui-form-input
  "Sugar for <Form.Field control={Input} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormInput"))

(def ui-feed-content
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - date (custom): An event can contain a date.
    - extraImages (custom): Shorthand for FeedExtra with images.
    - extraText (custom): Shorthand for FeedExtra with text.
    - meta (custom): Shorthand for FeedMeta.
    - summary (custom): Shorthand for FeedSummary."
  (sui-factory "FeedContent"))

(def ui-grid
  "A grid is used to harmonize negative space in a layout.

  Props:
    - as (custom): An element type to render as (string or function).
    - celled (bool|enum): A grid can have rows divided into cells. (internally)
    - centered (bool): A grid can have its columns centered.
    - children (node): Primary content.
    - className (string): Additional classes.
    - columns (enum): Represents column count per row in Grid. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, equal)
    - container (bool): A grid can be combined with a container to use the available layout and alignment.
    - divided (bool|enum): A grid can have dividers between its columns. (vertically)
    - doubling (bool): A grid can double its column width on tablet and mobile sizes.
    - inverted (bool): A grid's colors can be inverted.
    - padded (bool|enum): A grid can preserve its vertical and horizontal gutters on first and last columns. (horizontally, vertically)
    - relaxed (bool|enum): A grid can increase its gutters to allow for more negative space. (very)
    - reversed (custom): A grid can specify that its columns should reverse order at different device sizes.
    - stackable (bool): A grid can have its columns stack on-top of each other after reaching mobile breakpoints.
    - stretched (bool): A grid can stretch its contents to take up the entire grid height.
    - textAlign (enum): A grid can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A grid can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)"
  (sui-factory "Grid"))

(def ui-form-dropdown
  "Sugar for <Form.Field control={Dropdown} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormDropdown"))

(def ui-segment-inline
  "A placeholder segment can be inline.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "SegmentInline"))

(def ui-step-title
  "A step can contain a title.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "StepTitle"))

(def ui-card-content
  "A card can contain blocks of content or extra content meant to be formatted separately from the main content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for CardDescription.
    - extra (bool): A card can contain extra content meant to be formatted separately from the main content.
    - header (custom): Shorthand for CardHeader.
    - meta (custom): Shorthand for CardMeta.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
  (sui-factory "CardContent"))

(def ui-comment-action
  "A comment can contain an action.

  Props:
    - active (bool): Style as the currently active action.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentAction"))

(def ui-pagination-item
  "An item of a pagination.

  Props:
    - active (bool): A pagination item can be active.
    - disabled (bool): A pagination item can be disabled.
    - onClick (func): Called on click.
    - onKeyDown (func): Called on key down.
    - type (enum): A pagination should have a type. (ellipsisItem, firstItem, prevItem, pageItem, nextItem, lastItem)"
  (sui-factory "PaginationItem"))

(def ui-header
  "A header provides a short summary of content

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach header  to other content, like a segment. (top, bottom)
    - block (bool): Format header to appear inside a content block.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Color of the header. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): Show that the header is inactive.
    - dividing (bool): Divide header from the content below it.
    - floated (enum): Header can sit to the left or right of other content. (left, right)
    - icon (union): Add an icon by icon name or pass an Icon. ()
    - image (union): Add an image by img src or pass an Image. ()
    - inverted (bool): Inverts the color of the header for dark backgrounds.
    - size (enum): Content headings are sized with em and are based on the font-size of their container. (tiny, small, medium, large, huge)
    - sub (bool): Headers may be formatted to label smaller or de-emphasized content.
    - subheader (custom): Shorthand for Header.Subheader.
    - textAlign (enum): Align header content. (left, center, right, justified)"
  (sui-factory "Header"))

(def ui-label-group
  "A label can be grouped.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - circular (bool): Labels can share shapes.
    - className (string): Additional classes.
    - color (enum): Label group can share colors together. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - size (enum): Label group can share sizes together. (mini, tiny, small, medium, large, big, huge, massive)
    - tag (bool): Label group can share tag formatting."
  (sui-factory "LabelGroup"))

(def ui-modal-actions
  "A modal can contain a row of actions.

  Props:
    - actions (custom): Array of shorthand buttons.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - onActionClick (func): Action onClick handler when using shorthand `actions`. ()"
  (sui-factory "ModalActions"))

(def ui-breadcrumb
  "A breadcrumb is used to show hierarchy between content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - divider (custom): Shorthand for primary content of the Breadcrumb.Divider. ()
    - icon (custom): For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in ()
    - sections (custom): Shorthand array of props for Breadcrumb.Section.
    - size (enum): Size of Breadcrumb. (mini, tiny, small, large, big, huge, massive)"
  (sui-factory "Breadcrumb"))

(def ui-message-content
  "A message can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "MessageContent"))

(def ui-table
  "A table displays a collections of data grouped into rows.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach table to other content (top, bottom)
    - basic (enum|bool): A table can reduce its complexity to increase readability. (very)
    - celled (bool): A table may be divided each row into separate cells.
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsing (bool): A table can be collapsing, taking up only as much space as its rows.
    - color (enum): A table can be given a color to distinguish it from other tables. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - columns (enum): A table can specify its column count to divide its content evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - compact (bool|enum): A table may sometimes need to be more compact to make more rows visible at a time. (very)
    - definition (bool): A table may be formatted to emphasize a first column that defines a rows content.
    - fixed (bool): A table can use fixed a special faster form of table rendering that does not resize table cells based on content
    - footerRow (custom): Shorthand for a TableRow to be placed within Table.Footer.
    - headerRow (custom): Shorthand for a TableRow to be placed within Table.Header.
    - inverted (bool): A table's colors can be inverted.
    - padded (bool|enum): A table may sometimes need to be more padded for legibility. (very)
    - renderBodyRow (func): Mapped over `tableData` and should return shorthand for each Table.Row to be placed within Table.Body. ()
    - selectable (bool): A table can have its rows appear selectable.
    - singleLine (bool): A table can specify that its cell contents should remain on a single line and not wrap.
    - size (enum): A table can also be small or large. (small, large)
    - sortable (bool): A table may allow a user to sort contents by clicking on a table header.
    - stackable (bool): A table can specify how it stacks table content responsively.
    - striped (bool): A table can stripe alternate rows of content with a darker color to increase contrast.
    - structured (bool): A table can be formatted to display complex structured data.
    - tableData (array): Data to be passed to the renderBodyRow function. ()
    - textAlign (enum): A table can adjust its text alignment. (left, center, right)
    - unstackable (bool): A table can specify how it stacks table content responsively.
    - verticalAlign (enum): A table can adjust its text alignment. (bottom, middle, top)"
  (sui-factory "Table"))

(def ui-reveal-content
  "A content sub-component for the Reveal.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): A reveal may contain content that is visible before interaction.
    - visible (bool): A reveal may contain content that is hidden before user interaction."
  (sui-factory "RevealContent"))

(def ui-table-footer
  "A table can have a footer.

  Props:
    - as (custom): An element type to render as (string or function)."
  (sui-factory "TableFooter"))

(def ui-flag
  "A flag is is used to represent a political state.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - name (enum): Flag name, can use the two digit country code, the full name, or a common alias. (ad, andorra, ae, united arab emirates, uae, af, afghanistan, ag, antigua, ai, anguilla, al, albania, am, armenia, an, netherlands antilles, ao, angola, ar, argentina, as, american samoa, at, austria, au, australia, aw, aruba, ax, aland islands, az, azerbaijan, ba, bosnia, bb, barbados, bd, bangladesh, be, belgium, bf, burkina faso, bg, bulgaria, bh, bahrain, bi, burundi, bj, benin, bm, bermuda, bn, brunei, bo, bolivia, br, brazil, bs, bahamas, bt, bhutan, bv, bouvet island, bw, botswana, by, belarus, bz, belize, ca, canada, cc, cocos islands, cd, congo, cf, central african republic, cg, congo brazzaville, ch, switzerland, ci, cote divoire, ck, cook islands, cl, chile, cm, cameroon, cn, china, co, colombia, cr, costa rica, cs, cu, cuba ...)"
  (sui-factory "Flag"))

(def ui-item-group
  "A group of items.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - divided (bool): Items can be divided to better distinguish between grouped content.
    - items (custom): Shorthand array of props for Item.
    - link (bool): An item can be formatted so that the entire contents link to another page.
    - relaxed (bool|enum): A group of items can relax its padding to provide more negative space. (very)
    - unstackable (bool): Prevent items from stacking on mobile."
  (sui-factory "ItemGroup"))

(def ui-form
  "A Form displays a set of related user input fields in a structured way.

  Props:
    - action (string): The HTML form action
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - error (bool): Automatically show any error Message children.
    - inverted (bool): A form can have its color inverted for contrast.
    - loading (bool): Automatically show a loading indicator.
    - onSubmit (func): The HTML form submit handler.
    - reply (bool): A comment can contain a form to reply to a comment. This may have arbitrary content.
    - size (enum): A form can vary in size. (mini, tiny, small, large, big, huge, massive)
    - success (bool): Automatically show any success Message children.
    - unstackable (bool): A form can prevent itself from stacking on mobile.
    - warning (bool): Automatically show any warning Message children.
    - widths (enum): Forms can automatically divide fields to be equal width. (equal)"
  (sui-factory "Form"))

(def ui-form-field
  "A field is a form element containing a label and an input.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - control (custom): A form control component (i.e. Dropdown) or HTML tagName (i.e. 'input').
    - disabled (bool): Individual fields may be disabled.
    - error (bool): Individual fields may display an error state.
    - inline (bool): A field can have its label next to instead of above it.
    - label (node|object): Mutually exclusive with children. ()
    - required (bool): A field can show that input is mandatory.
    - type (): Passed to the control component (i.e. <input type='password' />) ()
    - width (enum): A field can specify its width in grid columns (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "FormField"))

(def ui-header-content
  "Header content wraps the main content when there is an adjacent Icon or Image.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "HeaderContent"))

(def ui-item-description
  "An item can contain a description with a single or multiple paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ItemDescription"))

(def ui-placeholder-paragraph
  "A placeholder can contain a paragraph.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "PlaceholderParagraph"))

(def ui-item-image
  "An item can contain an image.

  Props:
    - size (custom): An image may appear at different sizes."
  (sui-factory "ItemImage"))

(def ui-loader
  "A loader alerts a user to wait for an activity to complete.

  Props:
    - active (bool): A loader can be active or visible.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A loader can be disabled or hidden.
    - indeterminate (bool): A loader can show it's unsure of how long a task will take.
    - inline (bool|enum): Loaders can appear inline with content. (centered)
    - inverted (bool): Loaders can have their colors inverted.
    - size (enum): Loaders can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)"
  (sui-factory "Loader"))

(def ui-dropdown-menu
  "A dropdown menu can contain a menu.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - direction (enum): A dropdown menu can open to the left or to the right. (left, right)
    - open (bool): Whether or not the dropdown menu is displayed.
    - scrolling (bool): A dropdown menu can scroll."
  (sui-factory "DropdownMenu"))

(def ui-feed-extra
  "A feed can contain an extra content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - images (union): An event can contain additional information like a set of images. ()
    - text (bool): An event can contain additional text information."
  (sui-factory "FeedExtra"))

(def ui-form-checkbox
  "Sugar for <Form.Field control={Checkbox} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormCheckbox"))

(def ui-confirm
  "A Confirm modal gives the user a choice to confirm or cancel an action/

  Props:
    - cancelButton (custom): The cancel button text.
    - confirmButton (custom): The OK button text.
    - content (custom): The ModalContent text.
    - header (custom): The ModalHeader text.
    - onCancel (func): Called when the Modal is closed without clicking confirm.
    - onConfirm (func): Called when the OK button is clicked.
    - open (bool): Whether or not the modal is visible.
    - size (enum): A Confirm can vary in size (mini, tiny, small, large, fullscreen)"
  (sui-factory "Confirm"))

(def ui-list-list
  "A list can contain a sub list.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ListList"))

(def ui-visibility
  "Visibility provides a set of callbacks for when a content appears in the viewport.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - context (object): Context which visibility should attach onscroll events.
    - continuous (bool): When set to true a callback will occur anytime an element passes a condition not just immediately after the
    - fireOnMount (bool): Fires callbacks immediately after mount.
    - offset (number|string|arrayOf): Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the ()
    - onBottomPassed (func): Element's bottom edge has passed top of screen.
    - onBottomPassedReverse (func): Element's bottom edge has not passed top of screen.
    - onBottomVisible (func): Element's bottom edge has passed bottom of screen
    - onBottomVisibleReverse (func): Element's bottom edge has not passed bottom of screen.
    - onOffScreen (func): Element is not visible on the screen.
    - onOnScreen (func): Element is visible on the screen.
    - onPassed (object): Element is not visible on the screen.
    - onPassing (func): Any part of an element is visible on screen.
    - onPassingReverse (func): Element's top has not passed top of screen but bottom has.
    - onTopPassed (func): Element's top edge has passed top of the screen.
    - onTopPassedReverse (func): Element's top edge has not passed top of the screen.
    - onTopVisible (func): Element's top edge has passed bottom of screen.
    - onTopVisibleReverse (func): Element's top edge has not passed bottom of screen.
    - onUpdate (func): Element's top edge has passed bottom of screen.
    - once (bool): When set to false a callback will occur each time an element passes the threshold for a condition.
    - updateOn (enum): Allows to choose the mode of the position calculations: (events, repaint)"
  (sui-factory "Visibility"))

(def ui-comment-author
  "A comment can contain an author.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentAuthor"))

(def ui-form-button
  "Sugar for <Form.Field control={Button} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormButton"))

(def ui-step-content
  "A step can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for StepDescription.
    - title (custom): Shorthand for StepTitle."
  (sui-factory "StepContent"))

(def ui-feed-event
  "A feed contains an event.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for FeedContent.
    - date (custom): Shorthand for FeedDate.
    - extraImages (custom): Shorthand for FeedExtra with images.
    - extraText (custom): Shorthand for FeedExtra with content.
    - icon (custom): An event can contain icon label.
    - image (custom): An event can contain image label.
    - meta (custom): Shorthand for FeedMeta.
    - summary (custom): Shorthand for FeedSummary."
  (sui-factory "FeedEvent"))

(def ui-sidebar-pushable
  "A pushable sub-component for Sidebar.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "SidebarPushable"))

(def ui-list-content
  "A list item can contain a content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - floated (enum): An list content can be floated left or right. (left, right)
    - header (custom): Shorthand for ListHeader.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
  (sui-factory "ListContent"))

(def ui-item-meta
  "An item can contain content metadata.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ItemMeta"))

(def ui-form-text-area
  "Sugar for <Form.Field control={TextArea} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormTextArea"))

(def ui-card-group
  "A group of cards.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A group of cards can center itself inside its container.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - doubling (bool): A group of cards can double its column width for mobile.
    - items (custom): Shorthand array of props for Card.
    - itemsPerRow (enum): A group of cards can set how many cards should exist in a row. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - stackable (bool): A group of cards can automatically stack rows to a single columns on mobile devices.
    - textAlign (enum): A card group can adjust its text alignment. (left, center, right)"
  (sui-factory "CardGroup"))

(def ui-form-radio
  "Sugar for <Form.Field control={Radio} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  (sui-factory "FormRadio"))

(def ui-feed-like
  "A feed can contain a like element.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for icon. Mutually exclusive with children."
  (sui-factory "FeedLike"))

(def ui-placeholder-header
  "A placeholder can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A placeholder can contain an image."
  (sui-factory "PlaceholderHeader"))

(def ui-feed-meta
  "A feed can contain a meta.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - like (custom): Shorthand for FeedLike."
  (sui-factory "FeedMeta"))

(def ui-accordion-content
  "A content sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the content is visible.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "AccordionContent"))

(def ui-comment-group
  "Comments can be grouped.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comments can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content.
    - minimal (bool): Comments can hide extra information unless a user shows intent to interact with a comment.
    - size (enum): Comments can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - threaded (bool): A comment list can be threaded to showing the relationship between conversations."
  (sui-factory "CommentGroup"))

(def ui-rail
  "A rail is used to show accompanying content outside the boundaries of the main view of a site.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool): A rail can appear attached to the main viewport.
    - children (node): Primary content.
    - className (string): Additional classes.
    - close (bool|enum): A rail can appear closer to the main viewport. (very)
    - content (custom): Shorthand for primary content.
    - dividing (bool): A rail can create a division between itself and a container.
    - internal (bool): A rail can attach itself to the inside of a container.
    - position (enum): A rail can be presented on the left or right side of a container. (left, right)
    - size (enum): A rail can have different sizes. (mini, tiny, small, large, big, huge, massive)"
  (sui-factory "Rail"))

(def ui-feed-label
  "An event can contain an image or icon label.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): An event can contain icon label.
    - image (custom): An event can contain image label."
  (sui-factory "FeedLabel"))

(def ui-transitionable-portal
  "A sugar for `Portal` and `Transition`.

  Props:
    - children (node): Primary content.
    - onClose (func): Called when a close event happens.
    - onHide (func): Callback on each transition that changes visibility to hidden.
    - onOpen (func): Called when an open event happens.
    - onStart (func): Callback on animation start.
    - open (bool): Controls whether or not the portal is displayed.
    - transition (object): Transition props."
  (sui-factory "TransitionablePortal"))

(def ui-modal-description
  "A modal can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ModalDescription"))

(def ui-step-description
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "StepDescription"))

(def ui-pagination
  "A component to render a pagination.

  Props:
    - activePage (number|string): Index of the currently active page. ()
    - aria-label (string): A pagination item can have an aria label.
    - boundaryRange (number|string): Number of always visible pages at the beginning and end. ()
    - defaultActivePage (number|string): Initial activePage value. ()
    - ellipsisItem (custom): A shorthand for PaginationItem.
    - firstItem (custom): A shorthand for PaginationItem.
    - lastItem (custom): A shorthand for PaginationItem.
    - nextItem (custom): A shorthand for PaginationItem.
    - onPageChange (func): Called on change of an active page.
    - pageItem (custom): A shorthand for PaginationItem.
    - prevItem (custom): A shorthand for PaginationItem.
    - siblingRange (number|string): Number of always visible pages before and after the current one. ()
    - totalPages (number|string): Total number of pages. ()"
  (sui-factory "Pagination"))

(def ui-breadcrumb-section
  "A section sub-component for Breadcrumb component.

  Props:
    - active (bool): Style as the currently active section.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute. ()
    - link (bool): Render as an `a` tag instead of a `div`. ()
    - onClick (func): Called on click. When passed, the component will render as an `a`"
  (sui-factory "BreadcrumbSection"))

(def ui-accordion-title
  "A title sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - index (string|number): AccordionTitle index inside Accordion. ()
    - onClick (func): Called on click."
  (sui-factory "AccordionTitle"))

(def ui-placeholder
  "A placeholder is used to reserve splace for content that soon will appear in a layout.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): A fluid placeholder takes up the width of its container.
    - inverted (bool): A placeholder can have their colors inverted."
  (sui-factory "Placeholder"))

(def ui-dropdown-item
  "An item sub-component for Dropdown component.

  Props:
    - active (bool): Style as the currently chosen item.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Additional text with less emphasis.
    - disabled (bool): A dropdown item can be disabled.
    - flag (custom): Shorthand for Flag.
    - icon (custom): Shorthand for Icon.
    - image (custom): Shorthand for Image.
    - label (custom): Shorthand for Label.
    - onClick (func): Called on click.
    - selected (bool): The item currently selected by keyboard shortcut.
    - text (custom): Display text.
    - value (bool|number|string): Stored value. ()"
  (sui-factory "DropdownItem"))

(def ui-radio
  "A Radio is sugar for <Checkbox radio />.
  Useful for exclusive groups of sliders or toggles.

  Props:
    - slider (custom): Format to emphasize the current selection state.
    - toggle (custom): Format to show an on or off choice.
    - type (custom): HTML input type, either checkbox or radio."
  (sui-factory "Radio"))

(def ui-select
  "A Select is sugar for <Dropdown selection />.

  Props:
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
  (sui-factory "Select"))

(def ui-statistic-group
  "A group of statistics.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A statistic group can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - horizontal (bool): A statistic group can present its measurement horizontally.
    - inverted (bool): A statistic group can be formatted to fit on a dark background.
    - items (custom): Array of props for Statistic.
    - size (enum): A statistic group can vary in size. (mini, tiny, small, large, huge)
    - widths (enum): A statistic group can have its items divided evenly. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "StatisticGroup"))

(def ui-statistic-label
  "A statistic can contain a label to help provide context for the presented value.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "StatisticLabel"))

(def ui-list
  "A list groups related content.

  Props:
    - animated (bool): A list can animate to set the current item apart from the list.
    - as (custom): An element type to render as (string or function).
    - bulleted (bool): A list can mark items with a bullet.
    - celled (bool): A list can divide its items into cells.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - divided (bool): A list can show divisions between content.
    - floated (enum): An list can be floated left or right. (left, right)
    - horizontal (bool): A list can be formatted to have items appear horizontally.
    - inverted (bool): A list can be inverted to appear on a dark background.
    - items (custom): Shorthand array of props for ListItem.
    - link (bool): A list can be specially formatted for navigation links.
    - onItemClick (func): onClick handler for ListItem. Mutually exclusive with children. ()
    - ordered (bool): A list can be ordered numerically.
    - relaxed (bool|enum): A list can relax its padding to provide more negative space. (very)
    - selection (bool): A selection list formats list items as possible choices.
    - size (enum): A list can vary in size. (mini, tiny, small, medium, large, big, huge, massive)
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
  (sui-factory "List"))

(def ui-progress
  "A progress bar shows the progression of a task.

  Props:
    - active (bool): A progress bar can show activity.
    - as (custom): An element type to render as (string or function).
    - attached (enum): A progress bar can attach to and show the progress of an element (i.e. Card or Segment). (top, bottom)
    - autoSuccess (bool): Whether success state should automatically trigger when progress completes.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A progress bar can have different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): A progress bar be disabled.
    - error (bool): A progress bar can show a error state.
    - indicating (bool): An indicating progress bar visually indicates the current level of progress of a task.
    - inverted (bool): A progress bar can have its colors inverted.
    - label (custom): Can be set to either to display progress as percent or ratio.
    - percent (union): Current percent complete. ()
    - precision (number): Decimal point precision for calculated progress.
    - progress (bool|enum): A progress bar can contain a text value indicating current progress. (percent, ratio, value)
    - size (enum): A progress bar can vary in size. (tiny, small, medium, large, big)
    - success (bool): A progress bar can show a success state.
    - total (union): For use with value. Together, these will calculate the percent. Mutually excludes percent. ()
    - value (union): For use with total. Together, these will calculate the percent. Mutually excludes percent. ()
    - warning (bool): A progress bar can show a warning state."
  (sui-factory "Progress"))

(def ui-tab-pane
  "A tab pane holds the content of a tab.

  Props:
    - active (bool): A tab pane can be active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - loading (bool): A Tab.Pane can display a loading indicator."
  (sui-factory "TabPane"))

(def ui-modal
  "A modal displays content that temporarily blocks interactions with the main view of a site.

  Props:
    - actions (custom): Shorthand for Modal.Actions. Typically an array of button shorthand.
    - as (custom): An element type to render as (string or function).
    - basic (bool): A modal can reduce its complexity
    - centered (bool): A modal can be vertically centered in the viewport
    - children (node): Primary content.
    - className (string): Additional classes.
    - closeIcon (node|object|bool): Shorthand for the close icon. Closes the modal on click. ()
    - closeOnDimmerClick (bool): Whether or not the Modal should close when the dimmer is clicked.
    - closeOnDocumentClick (bool): Whether or not the Modal should close when the document is clicked.
    - content (custom): Simple text content for the Modal.
    - defaultOpen (bool): Initial value of open.
    - dimmer (enum): A Modal can appear in a dimmer. (true, inverted, blurring)
    - eventPool (string): Event pool namespace that is used to handle component events
    - header (custom): Modal displayed above the content in bold.
    - mountNode (any): The node where the modal should mount. Defaults to document.body.
    - onActionClick (func): Action onClick handler when using shorthand `actions`.
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - open (bool): Controls whether or not the Modal is displayed.
    - size (enum): A modal can vary in size (mini, tiny, small, large, fullscreen)
    - style (object): Custom styles.
    - trigger (node): Element to be rendered in-place where the portal is defined."
  (sui-factory "Modal"))

(def ui-card-description
  "A card can contain a description with one or more paragraphs.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
  (sui-factory "CardDescription"))

(def ui-item-extra
  "An item can contain extra content meant to be formatted separately from the main content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "ItemExtra"))

(def ui-modal-content
  "A modal can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A modal can contain image content.
    - scrolling (bool): A modal can use the entire size of the screen."
  (sui-factory "ModalContent"))

(def ui-breadcrumb-divider
  "A divider sub-component for Breadcrumb component.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Render as an `Icon` component with `divider` class instead of a `div`."
  (sui-factory "BreadcrumbDivider"))

(def ui-checkbox
  "A checkbox allows a user to select a value from a small set of options, often binary.

  Props:
    - as (custom): An element type to render as (string or function).
    - checked (bool): Whether or not checkbox is checked.
    - className (string): Additional classes.
    - defaultChecked (bool): The initial value of checked.
    - defaultIndeterminate (bool): Whether or not checkbox is indeterminate.
    - disabled (bool): A checkbox can appear disabled and be unable to change states
    - fitted (bool): Removes padding for a label. Auto applied when there is no label.
    - id (number|string): A unique identifier. ()
    - indeterminate (bool): Whether or not checkbox is indeterminate.
    - label (custom): The text of the associated label element.
    - name (string): The HTML input name.
    - onChange (func): Called when the user attempts to change the checked state.
    - onClick (func): Called when the checkbox or label is clicked.
    - onMouseDown (func): Called when the user presses down on the mouse.
    - radio (bool): Format as a radio element. This means it is an exclusive option. ()
    - readOnly (bool): A checkbox can be read-only and unable to change states.
    - slider (bool): Format to emphasize the current selection state. ()
    - tabIndex (number|string): A checkbox can receive focus. ()
    - toggle (bool): Format to show an on or off choice. ()
    - type (enum): HTML input type, either checkbox or radio. (checkbox, radio)
    - value (string|number): The HTML input value. ()"
  (sui-factory "Checkbox"))

(def ui-message-item
  "A message list can contain an item.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "MessageItem"))

(def ui-step-group
  "A set of steps.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Steps can be attached to other elements. (top, bottom)
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fluid (bool): A fluid step takes up the width of its container.
    - items (custom): Shorthand array of props for Step.
    - ordered (bool): A step can show a ordered sequence of steps.
    - size (enum): Steps can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stackable (enum): A step can stack vertically only on smaller screens. (tablet)
    - unstackable (bool): A step can prevent itself from stacking on mobile.
    - vertical (bool): A step can be displayed stacked vertically.
    - widths (enum): Steps can be divided evenly inside their parent. (..._.keys(numberMap), ..._.keys(numberMap).map(Number), ..._.values(numberMap))"
  (sui-factory "StepGroup"))

(def ui-table-cell
  "A table row can have cells.

  Props:
    - active (bool): A cell can be active or selected by a user.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsing (bool): A cell can be collapsing so that it only uses as much space as required.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A cell can be disabled.
    - error (bool): A cell may call attention to an error or a negative value.
    - icon (custom): Add an Icon by name, props object, or pass an <Icon />
    - negative (bool): A cell may let a user know whether a value is bad.
    - positive (bool): A cell may let a user know whether a value is good.
    - selectable (bool): A cell can be selectable.
    - singleLine (bool): A cell can specify that its contents should remain on a single line and not wrap.
    - textAlign (enum): A table cell can adjust its text alignment. (left, center, right)
    - verticalAlign (enum): A table cell can adjust its text alignment. (bottom, middle, top)
    - warning (bool): A cell may warn a user.
    - width (enum): A table can specify the width of individual columns independently. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "TableCell"))

(def ui-item-content
  "An item can contain content.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - meta (custom): Shorthand for ItemMeta component.
    - verticalAlign (enum): Content can specify its vertical alignment. (bottom, middle, top)"
  (sui-factory "ItemContent"))

(def ui-rating
  "A rating indicates user interest in content.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - clearable (bool|enum): You can clear the rating by clicking on the current start rating. (auto)
    - defaultRating (number|string): The initial rating value. ()
    - disabled (bool): You can disable or enable interactive rating.  Makes a read-only rating.
    - icon (enum): A rating can use a set of star or heart icons. (star, heart)
    - maxRating (number|string): The total number of icons. ()
    - onRate (func): Called after user selects a new rating.
    - rating (number|string): The current number of active icons. ()
    - size (enum): A progress bar can vary in size. (mini, tiny, small, large, huge, massive)"
  (sui-factory "Rating"))

(def ui-card-header
  "A card can contain a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card header can adjust its text alignment. (left, center, right)"
  (sui-factory "CardHeader"))

(def ui-tab
  "A Tab is a hidden section of content activated by a Menu.

  Props:
    - activeIndex (number|string): Index of the currently active tab. ()
    - as (custom): An element type to render as (string or function).
    - defaultActiveIndex (number|string): The initial activeIndex. ()
    - grid (object): Shorthand props for the Grid.
    - menu (object): Shorthand props for the Menu.
    - menuPosition (enum): Align vertical menu (left, right)
    - onTabChange (func): Called on tab change.
    - panes (arrayOf): Array of objects describing each Menu.Item and Tab.Pane: ([:name \"shape\"], [:value {:menuItem {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :pane {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :render {:name \"func\", :required false}}])
    - renderActiveOnly (bool): A Tab can render only active pane."
  (sui-factory "Tab"))

(def ui-popup-header
  "A PopupHeader displays a header in a Popover.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "PopupHeader"))

(def ui-advertisement
  "An ad displays third-party promotional content.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): Center the advertisement.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - test (bool|number|string): Text to be displayed on the advertisement. ()
    - unit (enum): Varies the size of the advertisement. (medium rectangle, large rectangle, vertical rectangle, small rectangle, mobile banner, banner, vertical banner, top banner, half banner, button, square button, small button, skyscraper, wide skyscraper, leaderboard, large leaderboard, mobile leaderboard, billboard, panorama, netboard, half page, square, small square)"
  (sui-factory "Advertisement"))

(def ui-mount-node
  "A component that allows to manage classNames on a DOM node in declarative manner.

  Props:
    - className (string): Additional classes.
    - node (custom): The DOM node where we will apply class names. Defaults to document.body."
  (sui-factory "MountNode"))

(def ui-sidebar
  "A sidebar hides additional content beside a page.

  Props:
    - animation (enum): Animation style. (overlay, push, scale down, uncover, slide out, slide along)
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - direction (enum): Direction the sidebar should appear on. (top, right, bottom, left)
    - duration (number|string): Duration of sidebar animation. ()
    - onHidden (func): Called after a sidebar has finished animating out.
    - onHide (func): Called before a sidebar begins to animate out.
    - onShow (func): Called when a sidebar has finished animating in.
    - onVisible (func): Called when a sidebar begins animating in.
    - target (object): A sidebar can handle clicks on the passed element.
    - visible (bool): Controls whether or not the sidebar is visible on the page.
    - width (enum): Sidebar width. (very thin, thin, wide, very wide)"
  (sui-factory "Sidebar"))

(def ui-accordion-accordion
  "An Accordion can contain sub-accordions.

  Props:
    - activeIndex (union): Index of the currently active panel. ()
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - defaultActiveIndex (union): Initial activeIndex value. ()
    - exclusive (bool): Only allow one panel open at a time.
    - onTitleClick (func): Called when a panel title is clicked. ()
    - panels (arrayOf): Shorthand array of props for Accordion. ()"
  (sui-factory "AccordionAccordion"))

(def ui-search-result
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (string): Additional text with less emphasis.
    - id (number|string): A unique identifier. ()
    - image (string): Add an image to the item.
    - onClick (func): Called on click.
    - price (string): Customized text for price.
    - renderer (func): Renders the result contents.
    - title (string): Display title."
  (sui-factory "SearchResult"))

(def ui-comment-avatar
  "A comment can contain an image or avatar.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - src (string): Specifies the URL of the image."
  (sui-factory "CommentAvatar"))

(def ui-statistic-value
  "A statistic can contain a numeric, icon, image, or text value.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - text (bool): Format the value with smaller font size to fit nicely beside number values."
  (sui-factory "StatisticValue"))

(def ui-text-area
  "A TextArea can be used to allow for extended user input.

  Props:
    - as (custom): An element type to render as (string or function).
    - autoHeight (bool): Indicates whether height of the textarea fits the content or not.
    - onChange (func): Called on change.
    - onInput (func): Called on input.
    - rows (number|string): Indicates row count for a TextArea. ()
    - style (object): Custom TextArea style.
    - value (number|string): The value of the textarea. ()"
  (sui-input-factory "TextArea"))

(def ui-icon
  "An icon is a glyph used to represent something else.

  Props:
    - aria-hidden (string): Icon can have an aria label.
    - aria-label (string): Icon can have an aria label.
    - as (custom): An element type to render as (string or function).
    - bordered (bool): Formatted to appear bordered.
    - circular (bool): Icon can formatted to appear circular.
    - className (string): Additional classes.
    - color (enum): Color of the icon. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - corner (bool): Icons can display a smaller corner icon.
    - disabled (bool): Show that the icon is inactive.
    - fitted (bool): Fitted, without space to left or right of Icon.
    - flipped (enum): Icon can flipped. (horizontally, vertically)
    - inverted (bool): Formatted to have its colors inverted for contrast.
    - link (bool): Icon can be formatted as a link.
    - loading (bool): Icon can be used as a simple loader.
    - name (enum): Name of the icon. (american sign language interpreting, assistive listening systems, audio description, blind, braille, closed captioning, closed captioning outline, deaf, low vision, phone volume, question circle, question circle outline, sign language, tty, universal access, wheelchair, angle double down, angle double left, angle double right, angle double up, angle down, angle left, angle right, angle up, arrow alternate circle down, arrow alternate circle down outline, arrow alternate circle left, arrow alternate circle left outline, arrow alternate circle right, arrow alternate circle right outline, arrow alternate circle up, arrow alternate circle up outline, arrow circle down, arrow circle left, arrow circle right, arrow circle up, arrow down, arrow left, arrow right, arrow up, arrows alternate, arrows alternate horizontal, arrows alternate vertical, caret down, caret left, caret right, caret square down, caret square down outline, caret square left, caret square left outline, caret square right, caret square right outline, caret square up, caret square up outline, caret up, cart arrow down, chart line, chevron circle down, chevron circle left, chevron circle right, chevron circle up, chevron down, chevron left, chevron right, chevron up, cloud download, cloud upload, download, exchange, expand arrows alternate, external alternate, external square alternate, hand point down, hand point down outline, hand point left, hand point left outline, hand point right, hand point right outline, hand point up, hand point up outline, hand pointer, hand pointer outline, history, level down alternate, level up alternate, location arrow, long arrow alternate down, long arrow alternate left, long arrow alternate right, long arrow alternate up, mouse pointer, play, random, recycle, redo, redo alternate, reply, reply all, retweet, share ...)
    - rotated (enum): Icon can rotated. (clockwise, counterclockwise)
    - size (enum): Size of the icon. (mini, tiny, small, large, big, huge, massive)"
  (sui-factory "Icon"))

(def ui-sidebar-pusher
  "A pushable sub-component for Sidebar.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
  (sui-factory "SidebarPusher"))

(def ui-table-row
  "A table can have rows.

  Props:
    - active (bool): A row can be active or selected by a user.
    - as (custom): An element type to render as (string or function).
    - cellAs (custom): An element type to render as (string or function).
    - cells (custom): Shorthand array of props for TableCell.
    - children (node): Primary content.
    - className (string): Additional classes.
    - disabled (bool): A row can be disabled.
    - error (bool): A row may call attention to an error or a negative value.
    - negative (bool): A row may let a user know whether a value is bad.
    - positive (bool): A row may let a user know whether a value is good.
    - textAlign (enum): A table row can adjust its text alignment. (left, center, right)
    - verticalAlign (enum): A table row can adjust its vertical alignment. (bottom, middle, top)
    - warning (bool): A row may warn a user."
  (sui-factory "TableRow"))

(def ui-feed-summary
  "A feed can contain a summary.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - date (custom): Shorthand for FeedDate.
    - user (custom): Shorthand for FeedUser."
  (sui-factory "FeedSummary"))

(def ui-table-body
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes."
  (sui-factory "TableBody"))

(def ui-comment-actions
  "A comment can contain an list of actions a user may perform related to this comment.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentActions"))

(def ui-item
  "An item view presents large collections of site content for display.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for ItemContent component.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - image (custom): Shorthand for ItemImage component.
    - meta (custom): Shorthand for ItemMeta component."
  (sui-factory "Item"))

(def ui-step
  "A step shows the completion status of an activity in a series of activities.

  Props:
    - active (bool): A step can be highlighted as active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - completed (bool): A step can show that a user has completed it.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for StepDescription.
    - disabled (bool): Show that the Loader is inactive.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute.
    - icon (custom): Shorthand for Icon.
    - link (bool): A step can be link.
    - onClick (func): Called on click. When passed, the component will render as an `a`
    - ordered (bool): A step can show a ordered sequence of steps. Passed from StepGroup.
    - title (custom): Shorthand for StepTitle."
  (sui-factory "Step"))

(def ui-image-group
  "A group of images.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): A group of images can be formatted to have the same size. (mini, tiny, small, medium, large, big, huge, massive)"
  (sui-factory "ImageGroup"))

(def ui-embed
  "An embed displays content from other websites like YouTube videos or Google Maps.

  Props:
    - active (bool): An embed can be active.
    - as (custom): An element type to render as (string or function).
    - aspectRatio (enum): An embed can specify an alternative aspect ratio. (4:3, 16:9, 21:9)
    - autoplay (bool): Setting to true or false will force autoplay. ()
    - brandedUI (bool): Whether to show networks branded UI like title cards, or after video calls to action. ()
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (string): Specifies a default chrome color with Vimeo or YouTube. ()
    - content (custom): Shorthand for primary content.
    - defaultActive (bool): Initial value of active.
    - hd (bool): Whether to prefer HD content. ()
    - icon (custom): Specifies an icon to use with placeholder content.
    - id (string): Specifies an id for source. ()
    - iframe (custom): Shorthand for HTML iframe. ()
    - onClick (func): Сalled on click.
    - placeholder (string): A placeholder image for embed.
    - source (enum): Specifies a source to use. (youtube, vimeo)
    - url (string): Specifies a url to use for embed. ()"
  (sui-factory "Embed"))

(def ui-segment
  "A segment is used to create a grouping of related content.

  Props:
    - as (custom): An element type to render as (string or function).
    - attached (bool|enum): Attach segment to other content, like a header. (top, bottom)
    - basic (bool): A basic segment has no special formatting.
    - children (node): Primary content.
    - circular (bool): A segment can be circular.
    - className (string): Additional classes.
    - clearing (bool): A segment can clear floated content.
    - color (enum): Segment can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - compact (bool): A segment may take up only as much space as is necessary.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A segment may show its content is disabled.
    - floated (enum): Segment content can be floated to the left or right. (left, right)
    - inverted (bool): A segment can have its colors inverted for contrast.
    - loading (bool): A segment may show its content is being loaded.
    - padded (bool|enum): A segment can increase its padding. (very)
    - piled (bool): Formatted to look like a pile of pages.
    - placeholder (bool): A segment can be used to reserve space for conditionally displayed content.
    - raised (bool): A segment may be formatted to raise above the page.
    - secondary (bool): A segment can be formatted to appear less noticeable.
    - size (enum): A segment can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - stacked (bool): Formatted to show it contains multiple pages.
    - tertiary (bool): A segment can be formatted to appear even less noticeable.
    - textAlign (enum): Formats content to be aligned as part of a vertical group. (left, center, right)
    - vertical (bool): Formats content to be aligned vertically."
  (sui-factory "Segment"))

(def ui-comment-metadata
  "A comment can contain metadata about the comment, an arbitrary amount of metadata may be defined.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "CommentMetadata"))

(def ui-ref
  "This component exposes a callback prop that always returns the DOM node of both functional and class component
  children.

  Props:
    - children (element): Primary content.
    - innerRef (func): Called when componentDidMount."
  (sui-factory "Ref"))

(def ui-grid-column
  "A column sub-component for Grid.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A grid column can be colored. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - computer (enum): A column can specify a width for a computer. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - floated (enum): A column can sit flush against the left or right edge of a row. (left, right)
    - largeScreen (enum): A column can specify a width for a large screen device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - mobile (enum): A column can specify a width for a mobile device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - only (custom): A column can appear only for a specific device, or screen sizes.
    - stretched (bool): A column can stretch its contents to take up the entire grid or row height.
    - tablet (enum): A column can specify a width for a tablet device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - textAlign (enum): A column can specify its text alignment. (left, center, right, justified)
    - verticalAlign (enum): A column can specify its vertical alignment to have all its columns vertically centered. (bottom, middle, top)
    - widescreen (enum): A column can specify a width for a wide screen device. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)
    - width (enum): Represents width of column. (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
  (sui-factory "GridColumn"))

(def ui-divider
  "A divider visually segments content into groups.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - clearing (bool): Divider can clear the content above it.
    - content (custom): Shorthand for primary content.
    - fitted (bool): Divider can be fitted without any space above or below it.
    - hidden (bool): Divider can divide content without creating a dividing line.
    - horizontal (bool): Divider can segment content horizontally.
    - inverted (bool): Divider can have its colours inverted.
    - section (bool): Divider can provide greater margins to divide sections of content.
    - vertical (bool): Divider can segment content vertically."
  (sui-factory "Divider"))

(def ui-form-select
  "Sugar for <Form.Field control={Select} />.

  Props:
    - as (custom): An element type to render as (string or function).
    - control (custom): A FormField control prop.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
  (sui-factory "FormSelect"))

(def ui-dropdown-search-input
  "A search item sub-component for Dropdown component.

  Props:
    - as (custom): An element type to render as (string or function).
    - autoComplete (string): An input can have the auto complete.
    - className (string): Additional classes.
    - inputRef (func): A ref handler for input.
    - tabIndex (number|string): An input can receive focus. ()
    - type (string): The HTML input type.
    - value (number|string): Stored value. ()"
  (sui-factory "DropdownSearchInput"))

(def ui-card-meta
  "A card can contain content metadata.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card meta can adjust its text alignment. (left, center, right)"
  (sui-factory "CardMeta"))

(def ui-table-header-cell
  "A table can have a header cell.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - sorted (enum): A header cell can be sorted in ascending or descending order. (ascending, descending)"
  (sui-factory "TableHeaderCell"))

(def ui-dropdown-header
  "A dropdown menu can contain a header.

  Props:
    - as (custom): An element type to render as (string or function)
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for Icon."
  (sui-factory "DropdownHeader"))

(def ui-statistic
  "A statistic emphasizes the current value of an attribute.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A statistic can be formatted to be different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - floated (enum): A statistic can sit to the left or right of other content. (left, right)
    - horizontal (bool): A statistic can present its measurement horizontally.
    - inverted (bool): A statistic can be formatted to fit on a dark background.
    - label (custom): Label content of the Statistic.
    - size (enum): A statistic can vary in size. (mini, tiny, small, large, huge)
    - text (bool): Format the StatisticValue with smaller font size to fit nicely beside number values.
    - value (custom): Value content of the Statistic."
  (sui-factory "Statistic"))

(def ui-menu-item
  "A menu can contain an item.

  Props:
    - active (bool): A menu item can be active.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): Additional colors can be specified. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - disabled (bool): A menu item can be disabled.
    - fitted (bool|enum): A menu item or menu can remove element padding, vertically or horizontally. (horizontally, vertically)
    - header (bool): A menu item may include a header or may itself be a header.
    - icon (bool|custom): MenuItem can be only icon. ()
    - index (number): MenuItem index inside Menu.
    - link (bool): A menu item can be link.
    - name (string): Internal name of the MenuItem.
    - onClick (func): Called on click. When passed, the component will render as an `a`
    - position (enum): A menu item can take left or right position. (left, right)"
  (sui-factory "MenuItem"))

(def ui-rating-icon
  "An internal icon sub-component for Rating component

  Props:
    - active (bool): Indicates activity of an icon.
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes.
    - index (number): An index of icon inside Rating.
    - onClick (func): Called on click.
    - onKeyUp (func): Called on keyup.
    - onMouseEnter (func): Called on mouseenter.
    - selected (bool): Indicates selection of an icon."
  (sui-factory "RatingIcon"))

(def ui-card
  "A card displays site content in a manner similar to a playing card.

  Props:
    - as (custom): An element type to render as (string or function).
    - centered (bool): A Card can center itself inside its container.
    - children (node): Primary content.
    - className (string): Additional classes.
    - color (enum): A Card can be formatted to display different colors. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for CardDescription.
    - extra (custom): Shorthand for primary content of CardContent.
    - fluid (bool): A Card can be formatted to take up the width of its container.
    - header (custom): Shorthand for CardHeader.
    - href (string): Render as an `a` tag instead of a `div` and adds the href attribute.
    - image (custom): A card can contain an Image component.
    - link (bool): A card can be formatted to link to other content.
    - meta (custom): Shorthand for CardMeta.
    - onClick (func): Called on click. When passed, the component renders as an `a`
    - raised (bool): A Card can be formatted to raise above the page."
  (sui-factory "Card"))

(def ui-dimmer-dimmable
  "A dimmable sub-component for Dimmer.

  Props:
    - as (custom): An element type to render as (string or function).
    - blurring (bool): A dimmable element can blur its contents.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
  (sui-factory "DimmerDimmable"))

(def ui-dropdown-divider
  "A dropdown menu can contain dividers to separate related content.

  Props:
    - as (custom): An element type to render as (string or function).
    - className (string): Additional classes."
  (sui-factory "DropdownDivider"))

(def ui-label-detail
  "

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "LabelDetail"))

(def ui-header-subheader
  "Headers may contain subheaders.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "HeaderSubheader"))

(def ui-message-list
  "A message can contain a list of items.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - items (custom): Shorthand Message.Items."
  (sui-factory "MessageList"))

(def ui-table-header
  "A table can have a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fullWidth (bool): A definition table can have a full width header or footer, filling in the gap left by the first column."
  (sui-factory "TableHeader"))

(def ui-feed-user
  "A feed can contain a user element.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "FeedUser"))

(def ui-menu-header
  "A menu item may include a header or may itself be a header.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  (sui-factory "MenuHeader"))

(def ui-dimmer
  "A dimmer hides distractions to focus attention on particular content.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - page (bool): A dimmer can be formatted to be fixed to the page."
  (sui-factory "Dimmer"))

(def ui-search
  "A search module allows a user to query for results from a selection of data

  Props:
    - aligned (string): A search can have its results aligned to its left or right container edge.
    - as (custom): An element type to render as (string or function).
    - category (bool): A search can display results from remote content ordered by categories.
    - categoryRenderer (func): Renders the SearchCategory contents.
    - className (string): Additional classes.
    - defaultOpen (bool): Initial value of open.
    - defaultValue (string): Initial value.
    - fluid (bool): A search can have its results take up the width of its container.
    - icon (node|object): Shorthand for Icon. ()
    - input (custom): A search input can take up the width of its container.
    - loading (bool): A search can show a loading indicator.
    - minCharacters (number): Minimum characters to query for results
    - noResultsDescription (node): Additional text for \"No Results\" message with less emphasis.
    - noResultsMessage (node): Message to display when there are no results.
    - onBlur (func): Called on blur.
    - onFocus (func): Called on focus.
    - onMouseDown (func): Called on mousedown.
    - onResultSelect (func): Called when a result is selected.
    - onSearchChange (func): Called on search input change.
    - onSelectionChange (func): Called when the active selection index is changed.
    - open (bool): Controls whether or not the results menu is displayed.
    - resultRenderer (func): Renders the SearchResult contents.
    - results (arrayOf|shape): One of: ()
    - selectFirstResult (bool): Whether the search should automatically select the first result after searching.
    - showNoResults (bool): Whether a \"no results\" message should be shown if no results are found.
    - size (enum): A search can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - value (string): Current value of the search input. Creates a controlled component."
  (sui-input-factory "Search"))

(def ui-dimmer-inner
  "

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A disabled dimmer cannot be activated
    - inverted (bool): A dimmer can be formatted to have its colors inverted.
    - onClick (func): Called on click.
    - onClickOutside (func): Handles click outside Dimmer's content, but inside Dimmer area.
    - page (bool): A dimmer can be formatted to be fixed to the page.
    - simple (bool): A dimmer can be controlled with simple prop.
    - verticalAlign (enum): A dimmer can have its content top or bottom aligned. (bottom, top)"
  (sui-factory "DimmerInner"))

(def ui-dropdown
  "A dropdown allows a user to select a value from a series of options.

  Props:
    - additionLabel (element|string): Label prefixed to an option added by a user. ()
    - additionPosition (enum): Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). (top, bottom)
    - allowAdditions (bool): Allow user additions to the list of options (boolean). ()
    - as (custom): An element type to render as (string or function).
    - basic (bool): A Dropdown can reduce its complexity.
    - button (bool): Format the Dropdown to appear as a button.
    - children (): Primary content. ()
    - className (string): Additional classes.
    - clearable (bool): Using the clearable setting will let users remove their selection from a dropdown.
    - closeOnBlur (bool): Whether or not the menu should close when the dropdown is blurred.
    - closeOnChange (bool): Whether or not the menu should close when a value is selected from the dropdown.
    - compact (bool): A compact dropdown has no minimum width.
    - deburr (bool): Whether or not the dropdown should strip diacritics in options and input search
    - defaultOpen (bool): Initial value of open.
    - defaultSearchQuery (string): Initial value of searchQuery.
    - defaultSelectedLabel (union): Currently selected label in multi-select. ()
    - defaultUpward (bool): Initial value of upward.
    - defaultValue (number|string|bool|arrayOf): Initial value or value array if multiple. ()
    - direction (enum): A dropdown menu can open to the left or to the right. (left, right)
    - disabled (bool): A disabled dropdown menu or item does not allow user interaction.
    - error (bool): An errored dropdown can alert a user to a problem.
    - floating (bool): A dropdown menu can contain floated content.
    - fluid (bool): A dropdown can take the full width of its parent
    - header (node): A dropdown menu can contain a header.
    - icon (node|object): Shorthand for Icon. ()
    - inline (bool): A dropdown can be formatted to appear inline in other content.
    - item (bool): A dropdown can be formatted as a Menu item.
    - labeled (bool): A dropdown can be labeled.
    - lazyLoad (bool): A dropdown can defer rendering its options until it is open.
    - loading (bool): A dropdown can show that it is currently loading data.
    - minCharacters (number): The minimum characters for a search to begin showing results.
    - multiple (bool): A selection dropdown can allow multiple selections.
    - noResultsMessage (string): Message to display when there are no results.
    - onAddItem (func): Called when a user adds a new item. Use this to update the options list.
    - onBlur (func): Called on blur.
    - onChange (func): Called when the user attempts to change the value.
    - onClick (func): Called on click.
    - onClose (func): Called when a close event happens.
    - onFocus (func): Called on focus.
    - onLabelClick (func): Called when a multi-select label is clicked.
    - onMouseDown (func): Called on mousedown.
    - onOpen (func): Called when an open event happens.
    - onSearchChange (func): Called on search input change.
    - open (bool): Controls whether or not the dropdown menu is displayed.
    - openOnFocus (bool): Whether or not the menu should open when the dropdown is focused.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ()
    - placeholder (string): Placeholder text.
    - pointing (bool|enum): A dropdown can be formatted so that its menu is pointing. (left, right, top, top left, top right, bottom, bottom left, bottom right)
    - renderLabel (func): Mapped over the active items and returns shorthand for the active item Labels.
    - scrolling (bool): A dropdown can have its menu scroll.
    - search (bool|func): A selection dropdown can allow a user to search through a large list of choices. ()
    - searchInput (array|node|object): A shorthand for a search input. ()
    - searchQuery (string): Current value of searchQuery. Creates a controlled component.
    - selectOnBlur (bool): Define whether the highlighted item should be selected on blur.
    - selectOnNavigation (bool): Whether or not to change the value when navigating the menu using arrow keys.
    - selectedLabel (union): Currently selected label in multi-select. ()
    - selection (bool): A dropdown can be used to select between choices in a form. ()
    - simple (bool): A simple dropdown can open without Javascript.
    - tabIndex (number|string): A dropdown can receive focus. ()
    - text (string): The text displayed in the dropdown, usually for the active item.
    - trigger (node): Custom element to trigger the menu to become visible. Takes place of 'text'. ()
    - upward (bool): Controls whether the dropdown will open upward.
    - value (bool|string|number|arrayOf): Current value or value array if multiple. Creates a controlled component. ()
    - wrapSelection (bool): A dropdown will go to the last element when ArrowUp is pressed on the first,"
  (sui-factory "Dropdown"))

(def ui-button-content
  "Used in some Button types, such as `animated`.

  Props:
    - as (custom): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): Initially hidden, visible on hover.
    - visible (bool): Initially visible, hidden on hover."
  (sui-factory "ButtonContent"))
